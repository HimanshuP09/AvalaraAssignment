
package model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Login implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("password")
    @Expose
    private String password;
    private final static long serialVersionUID = -2044123068805368247L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Login() {
    }

    /**
     * 
     * @param id
     * @param password
     */
    public Login(String id, String password) {
        super();
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
