package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineEanucc13Iterator theMagazine = (MagazineEanucc13Iterator)findAncestorWithClass(this, MagazineEanucc13Iterator.class);
			pageContext.getOut().print(theMagazine.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

