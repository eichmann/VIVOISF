package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BibliographicInformationSourceLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSourceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSourceLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BibliographicInformationSource theBibliographicInformationSource = (BibliographicInformationSource)findAncestorWithClass(this, BibliographicInformationSource.class);
			if (!theBibliographicInformationSource.commitNeeded) {
				pageContext.getOut().print(theBibliographicInformationSource.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			BibliographicInformationSource theBibliographicInformationSource = (BibliographicInformationSource)findAncestorWithClass(this, BibliographicInformationSource.class);
			return theBibliographicInformationSource.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing BibliographicInformationSource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			BibliographicInformationSource theBibliographicInformationSource = (BibliographicInformationSource)findAncestorWithClass(this, BibliographicInformationSource.class);
			theBibliographicInformationSource.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing BibliographicInformationSource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BibliographicInformationSource for label tag ");
		}
	}
}

