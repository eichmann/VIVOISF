package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentCodeFAOTERMIterator theContinent = (ContinentCodeFAOTERMIterator)findAncestorWithClass(this, ContinentCodeFAOTERMIterator.class);
			pageContext.getOut().print(theContinent.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

