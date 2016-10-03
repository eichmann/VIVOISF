package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIssn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineIssn currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIssn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineIssnIterator theMagazine = (MagazineIssnIterator)findAncestorWithClass(this, MagazineIssnIterator.class);
			pageContext.getOut().print(theMagazine.getIssn());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for issn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for issn tag ");
		}
		return SKIP_BODY;
	}
}

