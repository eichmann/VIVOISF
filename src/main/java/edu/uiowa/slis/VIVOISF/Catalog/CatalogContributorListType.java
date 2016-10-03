package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CatalogContributorListIterator theCatalogContributorListIterator = (CatalogContributorListIterator)findAncestorWithClass(this, CatalogContributorListIterator.class);
			pageContext.getOut().print(theCatalogContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

