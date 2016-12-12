package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupCodeFAOTERMIterator theSpecial_group = (Special_groupCodeFAOTERMIterator)findAncestorWithClass(this, Special_groupCodeFAOTERMIterator.class);
			pageContext.getOut().print(theSpecial_group.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

