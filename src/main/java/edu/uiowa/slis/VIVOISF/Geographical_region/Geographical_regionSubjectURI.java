package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_region theGeographical_region = (Geographical_region)findAncestorWithClass(this, Geographical_region.class);
			if (!theGeographical_region.commitNeeded) {
				pageContext.getOut().print(theGeographical_region.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Geographical_region theGeographical_region = (Geographical_region)findAncestorWithClass(this, Geographical_region.class);
			return theGeographical_region.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Geographical_region for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Geographical_region theGeographical_region = (Geographical_region)findAncestorWithClass(this, Geographical_region.class);
			theGeographical_region.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for subjectURI tag ");
		}
	}
}

