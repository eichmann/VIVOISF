package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSource theBibliographicInformationSource = (BibliographicInformationSource)findAncestorWithClass(this, BibliographicInformationSource.class);
			if (!theBibliographicInformationSource.commitNeeded) {
				pageContext.getOut().print(theBibliographicInformationSource.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			BibliographicInformationSource theBibliographicInformationSource = (BibliographicInformationSource)findAncestorWithClass(this, BibliographicInformationSource.class);
			return theBibliographicInformationSource.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing BibliographicInformationSource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			BibliographicInformationSource theBibliographicInformationSource = (BibliographicInformationSource)findAncestorWithClass(this, BibliographicInformationSource.class);
			theBibliographicInformationSource.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for subjectURI tag ");
		}
	}
}

