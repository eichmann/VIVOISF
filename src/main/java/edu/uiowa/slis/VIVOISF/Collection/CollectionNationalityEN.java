package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNationalityENIterator theCollection = (CollectionNationalityENIterator)findAncestorWithClass(this, CollectionNationalityENIterator.class);
			pageContext.getOut().print(theCollection.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

