package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionMemberType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionMemberType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionMemberType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionMemberIterator theCollectionMemberIterator = (CollectionMemberIterator)findAncestorWithClass(this, CollectionMemberIterator.class);
			pageContext.getOut().print(theCollectionMemberIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for member tag ");
		}
		return SKIP_BODY;
	}
}

