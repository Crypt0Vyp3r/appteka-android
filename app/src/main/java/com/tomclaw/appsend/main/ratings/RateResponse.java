package com.tomclaw.appsend.main.ratings;

import android.os.Parcel;
import android.os.Parcelable;

import com.tomclaw.appsend.util.Unobfuscatable;

/**
 * Created by solkin on 29/10/2017.
 */
public class RateResponse implements Parcelable, Unobfuscatable {

    private int status;

    public RateResponse() {
    }

    protected RateResponse(Parcel in) {
        status = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(status);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<RateResponse> CREATOR = new Creator<RateResponse>() {
        @Override
        public RateResponse createFromParcel(Parcel in) {
            return new RateResponse(in);
        }

        @Override
        public RateResponse[] newArray(int size) {
            return new RateResponse[size];
        }
    };

    public int getStatus() {
        return status;
    }
}
