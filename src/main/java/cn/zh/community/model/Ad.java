package cn.zh.community.model;

public class Ad {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD.ID
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD.TITLE
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD.URL
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD.IMAGE
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD.GMT_START
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    private Long gmtStart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD.GMT_END
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    private Long gmtEnd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD.GMT_CREATE
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD.GMT_MODIFIED
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD.STATUS
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AD.POS
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    private String pos;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD.ID
     *
     * @return the value of AD.ID
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD.ID
     *
     * @param id the value for AD.ID
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD.TITLE
     *
     * @return the value of AD.TITLE
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD.TITLE
     *
     * @param title the value for AD.TITLE
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD.URL
     *
     * @return the value of AD.URL
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD.URL
     *
     * @param url the value for AD.URL
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD.IMAGE
     *
     * @return the value of AD.IMAGE
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD.IMAGE
     *
     * @param image the value for AD.IMAGE
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD.GMT_START
     *
     * @return the value of AD.GMT_START
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public Long getGmtStart() {
        return gmtStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD.GMT_START
     *
     * @param gmtStart the value for AD.GMT_START
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public void setGmtStart(Long gmtStart) {
        this.gmtStart = gmtStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD.GMT_END
     *
     * @return the value of AD.GMT_END
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public Long getGmtEnd() {
        return gmtEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD.GMT_END
     *
     * @param gmtEnd the value for AD.GMT_END
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public void setGmtEnd(Long gmtEnd) {
        this.gmtEnd = gmtEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD.GMT_CREATE
     *
     * @return the value of AD.GMT_CREATE
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD.GMT_CREATE
     *
     * @param gmtCreate the value for AD.GMT_CREATE
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD.GMT_MODIFIED
     *
     * @return the value of AD.GMT_MODIFIED
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD.GMT_MODIFIED
     *
     * @param gmtModified the value for AD.GMT_MODIFIED
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD.STATUS
     *
     * @return the value of AD.STATUS
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD.STATUS
     *
     * @param status the value for AD.STATUS
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AD.POS
     *
     * @return the value of AD.POS
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public String getPos() {
        return pos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AD.POS
     *
     * @param pos the value for AD.POS
     *
     * @mbg.generated Fri Jan 31 15:11:46 CST 2020
     */
    public void setPos(String pos) {
        this.pos = pos == null ? null : pos.trim();
    }
}