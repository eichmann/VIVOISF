package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryCodeFAOTERMIterator theTerritory = (TerritoryCodeFAOTERMIterator)findAncestorWithClass(this, TerritoryCodeFAOTERMIterator.class);
			pageContext.getOut().print(theTerritory.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

