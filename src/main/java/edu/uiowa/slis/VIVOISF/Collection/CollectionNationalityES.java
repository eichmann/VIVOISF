package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNationalityESIterator theCollection = (CollectionNationalityESIterator)findAncestorWithClass(this, CollectionNationalityESIterator.class);
			pageContext.getOut().print(theCollection.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

