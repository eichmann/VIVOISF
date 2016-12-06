package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameListITIterator theCollection = (CollectionNameListITIterator)findAncestorWithClass(this, CollectionNameListITIterator.class);
			pageContext.getOut().print(theCollection.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

