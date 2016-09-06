package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineDoiIterator theMagazine = (MagazineDoiIterator)findAncestorWithClass(this, MagazineDoiIterator.class);
			pageContext.getOut().print(theMagazine.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for doi tag ");
		}
		return SKIP_BODY;
	}
}

