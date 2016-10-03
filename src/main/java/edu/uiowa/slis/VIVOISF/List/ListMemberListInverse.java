package edu.uiowa.slis.VIVOISF.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ListMemberListInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ListMemberListInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ListMemberListInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ListMemberListInverseIterator theListMemberListInverseIterator = (ListMemberListInverseIterator)findAncestorWithClass(this, ListMemberListInverseIterator.class);
			pageContext.getOut().print(theListMemberListInverseIterator.getMemberListInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing List for memberList tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for memberList tag ");
		}
		return SKIP_BODY;
	}
}

