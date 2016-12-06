package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNationalityRUIterator theCollection = (CollectionNationalityRUIterator)findAncestorWithClass(this, CollectionNationalityRUIterator.class);
			pageContext.getOut().print(theCollection.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

