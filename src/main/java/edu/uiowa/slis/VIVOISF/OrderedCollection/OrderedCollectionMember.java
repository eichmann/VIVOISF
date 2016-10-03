package edu.uiowa.slis.VIVOISF.OrderedCollection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrderedCollectionMember extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrderedCollectionMember currentInstance = null;
	private static final Log log = LogFactory.getLog(OrderedCollectionMember.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrderedCollectionMemberIterator theOrderedCollectionMemberIterator = (OrderedCollectionMemberIterator)findAncestorWithClass(this, OrderedCollectionMemberIterator.class);
			pageContext.getOut().print(theOrderedCollectionMemberIterator.getMember());
		} catch (Exception e) {
			log.error("Can't find enclosing OrderedCollection for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrderedCollection for member tag ");
		}
		return SKIP_BODY;
	}
}

