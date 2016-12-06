package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryCodeFAOTERMIterator theterritory = (territoryCodeFAOTERMIterator)findAncestorWithClass(this, territoryCodeFAOTERMIterator.class);
			pageContext.getOut().print(theterritory.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

