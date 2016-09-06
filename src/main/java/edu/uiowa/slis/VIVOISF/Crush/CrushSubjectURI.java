package edu.uiowa.slis.VIVOISF.Crush;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CrushSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CrushSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CrushSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Crush theCrush = (Crush)findAncestorWithClass(this, Crush.class);
			if (!theCrush.commitNeeded) {
				pageContext.getOut().print(theCrush.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Crush for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Crush for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Crush theCrush = (Crush)findAncestorWithClass(this, Crush.class);
			return theCrush.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Crush for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Crush for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Crush theCrush = (Crush)findAncestorWithClass(this, Crush.class);
			theCrush.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Crush for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Crush for subjectURI tag ");
		}
	}
}

