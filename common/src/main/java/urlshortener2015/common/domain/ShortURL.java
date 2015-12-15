package urlshortener2015.common.domain;

import java.net.URI;
import java.sql.Date;

public class ShortURL {

	private String hash;
	private String target;
	private URI uri;
	private String sponsor;
	private Date created;
	private String owner;
	private Integer mode;
	private Boolean safe;
	private String ip;
	private String country;
	private String qrCode;
	private String qrApi;
	private String publicidad;

	public ShortURL(String hash, String target, URI uri, String sponsor,
			Date created, String owner, Integer mode, Boolean safe, String ip,
			String country, String qrApi, String qrCode, String publicidad) {
		this.hash = hash;
		this.target = target;
		this.uri = uri;
		this.sponsor = sponsor;
		this.created = created;
		this.owner = owner;
		this.mode = mode;
		this.safe = safe;
		this.ip = ip;
		this.country = country;
		this.qrApi = qrApi;
		this.qrCode = qrCode;
		this.publicidad = publicidad;

	}

	public ShortURL() { }

	public String getHash() {
		return hash;
	}

	public String getTarget() {
		return target;
	}

	public URI getUri() {
		return uri;
	}

	public Date getCreated() {
		return created;
	}

	public String getOwner() {
		return owner;
	}

	public Integer getMode() {
		return mode;
	}

	public String getSponsor() {
		return sponsor;
	}

	public Boolean getSafe() {
		return safe;
	}

	public String getIP() {
		return ip;
	}

	public String getCountry() {
		return country;
	}

	public String getQrCode() {
		return qrCode;
	}

	public String getQrApi() {
		return qrApi;
	}

	//	public void setQrCode(String qrCode) {
	//		this.qrCode = qrCode;
	//	}
	public String getPublicidad() {
		return publicidad;
	}
}
