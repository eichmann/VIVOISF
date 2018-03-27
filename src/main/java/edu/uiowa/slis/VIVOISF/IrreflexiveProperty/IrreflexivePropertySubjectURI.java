package edu.uiowa.slis.VIVOISF.IrreflexiveProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IrreflexivePropertySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IrreflexivePropertySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IrreflexivePropertySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IrreflexiveProperty theIrreflexiveProperty = (IrreflexiveProperty)findAncestorWithClass(this, IrreflexiveProperty.class);
			if (!theIrreflexiveProperty.commitNeeded) {
				pageContext.getOut().print(theIrreflexiveProperty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IrreflexiveProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IrreflexiveProperty for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			IrreflexiveProperty theIrreflexiveProperty = (IrreflexiveProperty)findAncestorWithClass(this, IrreflexiveProperty.class);
			return theIrreflexiveProperty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing IrreflexiveProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IrreflexiveProperty for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			IrreflexiveProperty theIrreflexiveProperty = (IrreflexiveProperty)findAncestorWithClass(this, IrreflexiveProperty.class);
			theIrreflexiveProperty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing IrreflexiveProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IrreflexiveProperty for subjectURI tag ");
		}
	}
}

