package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupCodeFAOTERMIterator thespecial_group = (special_groupCodeFAOTERMIterator)findAncestorWithClass(this, special_groupCodeFAOTERMIterator.class);
			pageContext.getOut().print(thespecial_group.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

