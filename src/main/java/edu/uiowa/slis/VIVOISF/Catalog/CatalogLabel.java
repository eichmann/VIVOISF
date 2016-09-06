package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Catalog theCatalog = (Catalog)findAncestorWithClass(this, Catalog.class);
			if (!theCatalog.commitNeeded) {
				pageContext.getOut().print(theCatalog.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Catalog theCatalog = (Catalog)findAncestorWithClass(this, Catalog.class);
			return theCatalog.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Catalog for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Catalog theCatalog = (Catalog)findAncestorWithClass(this, Catalog.class);
			theCatalog.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for label tag ");
		}
	}
}

