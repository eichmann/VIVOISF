package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineIAO_0000136Iterator theMagazineIAO_0000136Iterator = (MagazineIAO_0000136Iterator)findAncestorWithClass(this, MagazineIAO_0000136Iterator.class);
			pageContext.getOut().print(theMagazineIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

