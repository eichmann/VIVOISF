package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameOfficialENIterator theCollection = (CollectionNameOfficialENIterator)findAncestorWithClass(this, CollectionNameOfficialENIterator.class);
			pageContext.getOut().print(theCollection.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

