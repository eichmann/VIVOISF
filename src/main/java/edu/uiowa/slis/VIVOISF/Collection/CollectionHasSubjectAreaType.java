package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasSubjectAreaIterator theCollectionHasSubjectAreaIterator = (CollectionHasSubjectAreaIterator)findAncestorWithClass(this, CollectionHasSubjectAreaIterator.class);
			pageContext.getOut().print(theCollectionHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

