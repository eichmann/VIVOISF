package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentFreetextKeywordIterator theContinent = (ContinentFreetextKeywordIterator)findAncestorWithClass(this, ContinentFreetextKeywordIterator.class);
			pageContext.getOut().print(theContinent.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

