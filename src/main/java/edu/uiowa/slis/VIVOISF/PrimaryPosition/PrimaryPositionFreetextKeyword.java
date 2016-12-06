package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionFreetextKeywordIterator thePrimaryPosition = (PrimaryPositionFreetextKeywordIterator)findAncestorWithClass(this, PrimaryPositionFreetextKeywordIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

