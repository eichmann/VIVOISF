package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasResearchAreaIterator theCollectionHasResearchAreaIterator = (CollectionHasResearchAreaIterator)findAncestorWithClass(this, CollectionHasResearchAreaIterator.class);
			pageContext.getOut().print(theCollectionHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

