package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionTheAbstractIterator theCollection = (CollectionTheAbstractIterator)findAncestorWithClass(this, CollectionTheAbstractIterator.class);
			pageContext.getOut().print(theCollection.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

