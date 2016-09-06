package edu.uiowa.slis.VIVOISF.Catalog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CatalogSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CatalogSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CatalogSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Catalog theCatalog = (Catalog)findAncestorWithClass(this, Catalog.class);
			if (!theCatalog.commitNeeded) {
				pageContext.getOut().print(theCatalog.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Catalog theCatalog = (Catalog)findAncestorWithClass(this, Catalog.class);
			return theCatalog.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Catalog for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Catalog theCatalog = (Catalog)findAncestorWithClass(this, Catalog.class);
			theCatalog.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Catalog for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Catalog for subjectURI tag ");
		}
	}
}

