package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameListZHIterator theCollection = (CollectionNameListZHIterator)findAncestorWithClass(this, CollectionNameListZHIterator.class);
			pageContext.getOut().print(theCollection.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

