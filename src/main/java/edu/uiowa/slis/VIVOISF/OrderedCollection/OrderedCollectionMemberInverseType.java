package edu.uiowa.slis.VIVOISF.OrderedCollection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrderedCollectionMemberInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrderedCollectionMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrderedCollectionMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrderedCollectionMemberInverseIterator theOrderedCollectionMemberInverseIterator = (OrderedCollectionMemberInverseIterator)findAncestorWithClass(this, OrderedCollectionMemberInverseIterator.class);
			pageContext.getOut().print(theOrderedCollectionMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OrderedCollection for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrderedCollection for member tag ");
		}
		return SKIP_BODY;
	}
}

