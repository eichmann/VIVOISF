package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineRO_0000056Iterator theMagazineRO_0000056Iterator = (MagazineRO_0000056Iterator)findAncestorWithClass(this, MagazineRO_0000056Iterator.class);
			pageContext.getOut().print(theMagazineRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

