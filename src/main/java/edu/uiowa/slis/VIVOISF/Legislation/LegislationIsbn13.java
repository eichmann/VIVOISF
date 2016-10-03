package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationIsbn13Iterator theLegislation = (LegislationIsbn13Iterator)findAncestorWithClass(this, LegislationIsbn13Iterator.class);
			pageContext.getOut().print(theLegislation.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

