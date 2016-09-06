package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentCodeISO2Iterator theContinent = (ContinentCodeISO2Iterator)findAncestorWithClass(this, ContinentCodeISO2Iterator.class);
			pageContext.getOut().print(theContinent.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

