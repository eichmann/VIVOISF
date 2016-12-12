package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupCodeFAOTERMIterator theGroup = (GroupCodeFAOTERMIterator)findAncestorWithClass(this, GroupCodeFAOTERMIterator.class);
			pageContext.getOut().print(theGroup.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

