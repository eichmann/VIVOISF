package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryFreetextKeywordIterator theterritory = (territoryFreetextKeywordIterator)findAncestorWithClass(this, territoryFreetextKeywordIterator.class);
			pageContext.getOut().print(theterritory.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

