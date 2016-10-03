package edu.uiowa.slis.VIVOISF.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ListMemberListInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ListMemberListInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ListMemberListInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ListMemberListInverseIterator theListMemberListInverseIterator = (ListMemberListInverseIterator)findAncestorWithClass(this, ListMemberListInverseIterator.class);
			pageContext.getOut().print(theListMemberListInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing List for memberList tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for memberList tag ");
		}
		return SKIP_BODY;
	}
}

