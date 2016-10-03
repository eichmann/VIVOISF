package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationIsbn10Iterator theLegislation = (LegislationIsbn10Iterator)findAncestorWithClass(this, LegislationIsbn10Iterator.class);
			pageContext.getOut().print(theLegislation.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

