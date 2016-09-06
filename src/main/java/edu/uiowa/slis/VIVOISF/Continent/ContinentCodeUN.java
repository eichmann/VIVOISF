package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentCodeUNIterator theContinent = (ContinentCodeUNIterator)findAncestorWithClass(this, ContinentCodeUNIterator.class);
			pageContext.getOut().print(theContinent.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

