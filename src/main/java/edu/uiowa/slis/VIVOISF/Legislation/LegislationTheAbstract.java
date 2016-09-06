package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationTheAbstractIterator theLegislation = (LegislationTheAbstractIterator)findAncestorWithClass(this, LegislationTheAbstractIterator.class);
			pageContext.getOut().print(theLegislation.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

