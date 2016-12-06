package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameListARIterator theCollection = (CollectionNameListARIterator)findAncestorWithClass(this, CollectionNameListARIterator.class);
			pageContext.getOut().print(theCollection.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

