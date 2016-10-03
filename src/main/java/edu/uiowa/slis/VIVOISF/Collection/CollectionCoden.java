package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionCodenIterator theCollection = (CollectionCodenIterator)findAncestorWithClass(this, CollectionCodenIterator.class);
			pageContext.getOut().print(theCollection.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for coden tag ");
		}
		return SKIP_BODY;
	}
}

