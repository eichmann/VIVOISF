package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasEmailIterator theCollectionHasEmailIterator = (CollectionHasEmailIterator)findAncestorWithClass(this, CollectionHasEmailIterator.class);
			pageContext.getOut().print(theCollectionHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

