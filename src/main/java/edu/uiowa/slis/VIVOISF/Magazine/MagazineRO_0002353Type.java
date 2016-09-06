package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineRO_0002353Iterator theMagazineRO_0002353Iterator = (MagazineRO_0002353Iterator)findAncestorWithClass(this, MagazineRO_0002353Iterator.class);
			pageContext.getOut().print(theMagazineRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

