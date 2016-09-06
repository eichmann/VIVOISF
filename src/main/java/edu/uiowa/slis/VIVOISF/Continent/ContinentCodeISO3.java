package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentCodeISO3Iterator theContinent = (ContinentCodeISO3Iterator)findAncestorWithClass(this, ContinentCodeISO3Iterator.class);
			pageContext.getOut().print(theContinent.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

