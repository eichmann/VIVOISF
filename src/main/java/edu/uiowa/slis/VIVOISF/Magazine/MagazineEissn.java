package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineEissn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineEissn currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineEissn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineEissnIterator theMagazine = (MagazineEissnIterator)findAncestorWithClass(this, MagazineEissnIterator.class);
			pageContext.getOut().print(theMagazine.getEissn());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for eissn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for eissn tag ");
		}
		return SKIP_BODY;
	}
}

