package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationAuthorListIterator theLegislationAuthorListIterator = (LegislationAuthorListIterator)findAncestorWithClass(this, LegislationAuthorListIterator.class);
			pageContext.getOut().print(theLegislationAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for authorList tag ");
		}
		return SKIP_BODY;
	}
}

