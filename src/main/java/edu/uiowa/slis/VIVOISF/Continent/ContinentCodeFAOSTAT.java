package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentCodeFAOSTATIterator theContinent = (ContinentCodeFAOSTATIterator)findAncestorWithClass(this, ContinentCodeFAOSTATIterator.class);
			pageContext.getOut().print(theContinent.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

