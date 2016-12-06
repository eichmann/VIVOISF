package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNationalityZHIterator theCollection = (CollectionNationalityZHIterator)findAncestorWithClass(this, CollectionNationalityZHIterator.class);
			pageContext.getOut().print(theCollection.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

