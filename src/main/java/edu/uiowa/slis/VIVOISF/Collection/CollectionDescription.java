package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionDescriptionIterator theCollection = (CollectionDescriptionIterator)findAncestorWithClass(this, CollectionDescriptionIterator.class);
			pageContext.getOut().print(theCollection.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for description tag ");
		}
		return SKIP_BODY;
	}
}

